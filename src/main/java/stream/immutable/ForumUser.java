package stream.immutable;

import java.util.Objects;

public final class ForumUser {
    private final String username;
    private final String realName;

    public ForumUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    @Override
    public String toString() {
        return "ForumUser" +
                "username='" + username + '\'' +
                ", realName='" + realName + '\'' + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (!Objects.equals(username, forumUser.username)) return false;
        return Objects.equals(realName, forumUser.realName);
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        return result;
    }
}
