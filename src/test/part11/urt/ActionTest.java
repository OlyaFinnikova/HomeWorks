package part11.urt;

import org.junit.Assert;
import org.junit.Test;
import part11.urt.actions.ActionCreate;
import part11.urt.actions.ActionDelete;
import part11.urt.actions.ActionMarkAsCompleted;
import part11.urt.task.Case;
import part11.urt.task.Importance;

import java.util.HashMap;
import java.util.Map;

public class ActionTest {
    @Test
    public void createSuccess() {
        Map<String, Case> cases = new HashMap<>();
        cases.put("Купить", new Case("Купить", "молоко", Importance.CRITICAL));
        cases.put("Уборка", new Case("Уборка", "", Importance.CRITICAL));
        create(cases, "Поздравить подругу Аню");
        Assert.assertEquals(3, cases.size());
    }

    @Test
    public void createWithoutSuccess() {
        Map<String, Case> cases = new HashMap<>();
        cases.put("Купить", new Case("Купить", "молоко", Importance.CRITICAL));
        cases.put("Поздравить подругу Аню", new Case("Уборка", "", Importance.CRITICAL));
        create(cases, "Поздравить подругу Аню");
        Assert.assertEquals(2, cases.size());
    }

    @Test
    public void deleteSuccess() {
        Map<String, Case> cases = new HashMap<>();
        cases.put("Купить", new Case("Купить", "молоко", Importance.CRITICAL));
        cases.put("Поздравить подругу Аню", new Case("Уборка", "", Importance.CRITICAL));
        ActionDelete action = new ActionDelete("Поздравить подругу Аню");
        action.execute(cases);
        Assert.assertEquals(1, cases.size());
    }

    @Test
    public void markAsCompleted() {
        Map<String, Case> cases = new HashMap<>();
        cases.put("Купить", new Case("Купить", "молоко", Importance.CRITICAL));
        cases.put("Поздравить подругу Аню", new Case("Уборка", "", Importance.CRITICAL));
        ActionMarkAsCompleted action = new ActionMarkAsCompleted("Поздравить подругу Аню");
        action.execute(cases);
        Assert.assertTrue(cases.get("Поздравить подругу Аню").isStatusCompletion());
    }

    private void create(Map<String, Case> cases, String name) {
        ActionCreate action = new ActionCreate(name,
                new AddingCases(new CaseCreator() {
                    @Override
                    public Case create(String name) {
                        return new Case(name, "С Днём Рождения", Importance.CRITICAL);
                    }
                }));
        action.execute(cases);
    }
}
