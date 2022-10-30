import java.time.LocalDate;

public class Cat {
   private String name;
//   private int age;
    Cat [] frinds;
 private   int birth;
    Cat(String name){
        this(name, 0);
    }
    public Cat(String name, int age) {
        this.name = name;
        if (age >= 0 ){
            this.birth =  LocalDate.now().getYear() - age;
        }else
        {
            this.birth =  LocalDate.now().getYear() - Math.abs(age);
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birth;
    }

    public Cat[] getFrinds() {
        return frinds;
    }
    public void setName(String name) {
        if (name != null && !name.isBlank() && !name.isEmpty())
        {
            this.name = name;
        }else {
            this.name = "Kissa";
        }
    }


    @Override
    public String toString() {
        return "Имя кота " + name + " Возраст кота " + getAge();
    }
}
