public class Bank {
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    public int computeTotalEmployees() {
        return numberOfLoanOfficers + numberOfTellers;
    }

    public String toString() {
        return "This bank has " + numberOfLoanOfficers 
            + " loan officers and " + numberOfTellers + " tellers.";
    }

    public boolean equals(Bank other) {
        return this.numberOfLoanOfficers == other.numberOfLoanOfficers 
            && this.numberOfTellers == other.numberOfTellers;
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers += numberToHire;
        } else {
            numberOfTellers += numberToHire;
        }
    }

    public double getEmployeeRatio() {
        return (double) numberOfLoanOfficers / numberOfTellers;
    }

    public void fireMembers(int numberToFire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            if (numberToFire >= numberOfLoanOfficers) {
                numberOfLoanOfficers = 0;
            } else {
                numberOfLoanOfficers -= numberToFire;
            }
        } else {
            if (numberToFire >= numberOfTellers) {
                numberOfTellers = 0;
            } else {
                numberOfTellers -= numberToFire;
            }
        }
    }

    public void transferEmployee(boolean fromLoanOfficer) {
        if (fromLoanOfficer) {
            numberOfLoanOfficers -= 1;
            numberOfTellers += 1;
        } else {
            numberOfTellers -= 1;
            numberOfLoanOfficers += 1;
        }
    }
    
    public double calculateTotalEmployeeSalary() {
        return 75000 * numberOfLoanOfficers + 45000 * numberOfTellers;
    }
}
