public class EncapsulationEX {
    private String name;
    private int age;
    private int id;
    private int BOD;
    private Number Phonenumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Number getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(Number Phonenumber) {
        this.Phonenumber = Phonenumber;
    }

    public int getBOD() {
        return BOD;
    }

    public void setBOD(int BOD) {
        this.BOD = BOD;
    }

    public static void main(String[] args) {
        EncapsulationEX ob=new EncapsulationEX();
        ob.setAge(19);
        ob.setBOD(1999);
        ob.setId(905);
        ob.setPhonenumber(999999999);
        ob.setName("Anuragh");
        System.out.println("name-"+ob.getName()+"\n"+"age-"+ob.getAge()+"\n"+"BOD-"+ob.getBOD()+"\n"+"id-"+ob.getId()+"\n"+"phone-"+ob.getPhonenumber());
        System.out.println("this is my pc");
    }
    
}
