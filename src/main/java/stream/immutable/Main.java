package stream.immutable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<ForumUser> forumUserList = new ArrayList<>();
        forumUserList.add(new ForumUser("a","a"));
        forumUserList.add(new ForumUser("b","b"));
        forumUserList.add(new ForumUser("c","c"));
        forumUserList.add(new ForumUser("d","d"));

        List<ForumUser> finnal = forumUserList.stream()
                .map(fs -> new ForumUser(fs.getUsername(), fs.getRealName().toUpperCase()))
                .collect(Collectors.toList());

        System.out.println(finnal);

    }
}