package problem.code.convention.dependency;

public class ComplainDupRepo {
    public ComplainDup findByComplainIdNew(Long complainId) {
        ComplainDup complainDup = new ComplainDup();
        complainDup.setComplainId(complainId);
        return complainDup;
    }
}
