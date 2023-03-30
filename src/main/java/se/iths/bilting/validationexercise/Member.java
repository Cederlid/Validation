package se.iths.bilting.validationexercise;



import jakarta.validation.constraints.*;


public class Member {
    @NotBlank
    private String name;
   @Pattern(regexp = "[1-9][0-9]{4}")
    private String postCode;
    @NotBlank
    private String phone;
    @Email
    private String email;
    @NotBlank
    private String personalNumber;
    @Min(1)@Max(600)
    private double weight;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", postCode='" + postCode + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", personalNumber='" + personalNumber + '\'' +
                ", weight=" + weight;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
