package problem.code.convention.dependency;

import java.util.Optional;

public class CompProcessRepo {
    public Optional<CompProcess>  findByComplainIdAndStepAndStatus(Long complainId, String step, String status){
        return Optional.of(new CompProcess());
    }
}
