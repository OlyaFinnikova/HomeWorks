package part10.unit1;

import java.util.*;

public interface IExecutionCommand {

   List<Table> listTable = new ArrayList<>();
   Parsing parsing = new Parsing();
   void executeCommand(String text);
}
