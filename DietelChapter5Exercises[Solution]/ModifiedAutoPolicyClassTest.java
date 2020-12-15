public class ModifiedAutoPolicyClassTest {
    public static void main(String[] args) {
        ModifiedAutoPolicyClass policy1= new ModifiedAutoPolicyClass(1111,"Toyota Camry","MA");
        ModifiedAutoPolicyClass policy2= new ModifiedAutoPolicyClass(1111,"Ford Fusion","ME");
        policyChecker(policy1);
        policyChecker(policy2);
        policy1.setState("NY");
        policyChecker(policy1);
    }

    public static void policyChecker( ModifiedAutoPolicyClass policy) {
        System.out.println("The policy is:");
        System.out.printf("Account number is :%d,Car name is:%s, State is :%s, %s a no-fault State%n%n",policy.getAccountNumber(),policy.getMakeAndModel(),policy.getState(),
                (policy.isNoFaultState()?"is":"is not"));

    }
}
