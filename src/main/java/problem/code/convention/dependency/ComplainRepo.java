package problem.code.convention.dependency;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ComplainRepo {
    public List<Map> loadFullDataById(Long complainId) {
        return new ArrayList<>();
    }
    public Complain findByComplainId(Long sourceDupId){
        return  new Complain();
    }
}
