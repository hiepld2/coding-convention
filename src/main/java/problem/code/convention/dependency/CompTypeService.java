package problem.code.convention.dependency;

public class CompTypeService {
    public CompType findByCompTypeId(Long compTypeId) {
        CompType compType = new CompType();
        compType.setCompTypeId(compTypeId);
        return compType;
    }
}
