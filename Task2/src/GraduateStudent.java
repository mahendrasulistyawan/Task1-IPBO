public class GraduateStudent extends Student {
    private String thesisTitle;
    private String advisorName;

    // Constructor tanpa parameter
    public GraduateStudent() {
    }

    // Constructor dengan parameter
    public GraduateStudent(Integer nim, String name, String email, String thesisTitle, String advisorName) {
        // Memanggil constructor dari superclass (Student)
        super(nim, name, email);
        this.thesisTitle = thesisTitle;
        this.advisorName = advisorName;
    }

    // Getter dan Setter
    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }

    // Override method displayInfo() dari superclass
    @Override
    public void displayInfo() {
        super.displayInfo(); // panggil method dari Student
        System.out.println("Thesis Title: " + thesisTitle);
        System.out.println("Advisor: " + advisorName);
    }
}
