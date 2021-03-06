package case_study_md2.furama_resort.models;

public abstract class Person {
    private String name;
    private String birthday;
    private String gender;
    private int iDNo;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name, String birthday, String gender, int iDNo, String phoneNumber, String email) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.iDNo = iDNo;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getiDNo() {
        return iDNo;
    }

    public void setiDNo(int iDNo) {
        this.iDNo = iDNo;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", iDNo=" + iDNo +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'';
    }

    public String getInformationToCSV() {
        return name + "," + birthday + "," + gender + "," + iDNo + "," + phoneNumber + "," + email;
    }
}
