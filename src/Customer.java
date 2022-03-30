public class Customer {
     private String ssn;

    public Customer(String ssn) {
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;

        if(obj == null || obj.getClass()!= this.getClass())
            return false;
        Customer cust = (Customer) obj;


        return (cust.ssn == this.ssn );
    }

    @Override
    public int hashCode()
    {
        return Integer.parseInt(this.ssn);
    }

}
