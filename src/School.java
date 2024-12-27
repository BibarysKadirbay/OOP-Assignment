import java.util.*;

public class School {
    private ArrayList<Person> members;
    public School() {
        this.members = new ArrayList<>();
    }
    public void addMember(Person person) {
        members.add(person);
    }

    public ArrayList<Person> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Person> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        members.sort(Comparator.comparing(Person::getSurname));
        StringBuilder result = new StringBuilder();
        for (Person member : members) {
            result.append(member.toString()).append("\n");
        }
        return result.toString();
    }
}