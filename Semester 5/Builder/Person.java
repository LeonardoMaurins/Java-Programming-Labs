public class Person {
    // Declares private string variables
    // Are required
    private String firstName;
    private String lastName;

    // Declares private boolean variables
    // Are optional
    private String middleName;
    private int age;
    private String fathersName;
    private String mothersName;
    private double height;
    private double weight;

    // Constructor with 1 argument declaring local variables
    public Person(Builder builder) {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.fathersName = builder.fathersName;
        this.mothersName = builder.mothersName;
        this.height = builder.height;
        this.weight = builder.weight;
    }

    // Display method which outputs human data variables
    public void display(){
        System.out.println(firstName + "," + middleName + "," + lastName + "," +
                           age + "," + fathersName + "," + mothersName + "," + height + "," + weight);
    }

    // Static class that builds the data by declaring,
    // initializing it locally and setting values
    public static class Builder {
        // Declares private string variables
        // Are required
        private String firstName;
        private String middleName;
        private String lastName;
        private int age;
        private String fathersName;
        private String mothersName;
        private double height;
        private double weight;

        // Class constructor with 2 arguments declaring local variables
        public Builder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Sets the passed variable to the local variable
        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }
        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setFathersName(String fathersName) {
            this.fathersName = fathersName;
            return this;
        }
        public Builder setMothersName(String mothersName) {
            this.mothersName = mothersName;
            return this;
        }
        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }
        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        // Creates an object build of the following class
        public Person build() {
            return new Person(this);
        }
    }
}
