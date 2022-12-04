public class Unit {
    private String code;
    private String title;
    private enum UnitType {core, elective};  //special "class"
    private UnitType type;



    public String toString() {
        return "Code: "+code+", title: "+title+", type: "+type;
    }


    //getters
    public String getCode() {
        return code;
    }
    public String getTitle() {
        return title;
    }
}
