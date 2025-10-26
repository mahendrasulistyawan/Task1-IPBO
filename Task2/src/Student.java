public class Student {
    private Integer nim;
    private String name;
    private String email;

    // Constructor tanpa parameter
    public Student() {
    }

    // Constructor dengan parameter
    public Student(Integer nim, String name, String email) {
        this.nim = nim;
        this.name = name;
        this.email = email;
    }

    // Getter dan Setter
    public Integer getNim() {
        return nim;
    }

    public void setNim(Integer nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method untuk menampilkan data
    public void displayInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
