package mapslab;

import java.util.*;
import org.apache.commons.lang3.builder.CompareToBuilder;

public class Employee implements Comparable {
    private String lastName;
    private String firstName;
    private String ssn;

    public Employee(String lastName, String firstName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

   

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

        @Override
    public String toString() {
        return firstName + " " + lastName + " " + ssn;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.ssn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }
    @Override
    public int compareTo(Object other) {
        Employee e = (Employee) other;

        return new CompareToBuilder()
                .append(this.ssn, e.ssn)
                .append(this.firstName, e.firstName)
//                .append(this.name, t.name)
                .toComparison();
    }
    

   
    

    
}
