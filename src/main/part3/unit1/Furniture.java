package part3.unit1;
/**
 * Класс описывает мебель
 */
public class Furniture {

    private NameFurniture name;
    private ColorFurniture color;
    private TypeFurniture type;

    public Furniture() {
    }

    /**
     * @param name  Название
     * @param color Цвет
     * @param type Тип
     */
    public Furniture(NameFurniture name, ColorFurniture color, TypeFurniture type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    /**
     * @return Название
     */

    public NameFurniture getName() {
        return name;
    }
    /**
     * @param name Название
     */
    public void setName(NameFurniture name) {
        this.name = name;
    }
    /**
     * @return Цвет
     */
    public ColorFurniture getColor() {
        return color;
    }
    /**
     * @param color Цвет
     */
    public void setColor(ColorFurniture color) {
        this.color = color;
    }
    /**
     * @return Тип
     */
    public TypeFurniture getType() {
        return type;
    }
    /**
     * @param type Тип
     */
    public void setType(TypeFurniture type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Мебель(Название=" + name.getName()+
                ", цвет=" + color.getName() +
                ", тип=" + type.getName() +
                ')';
    }
}
