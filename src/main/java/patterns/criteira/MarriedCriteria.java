package patterns.criteira;

import java.util.List;
import java.util.stream.Collectors;

public class MarriedCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        return people.stream()
                .filter(person -> person.isMarried())
                .collect(Collectors.toList());
    }
}
