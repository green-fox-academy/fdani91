package Blog;

import java.util.Date;

public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;

    public static void main(String[] args) {

        BlogPost first = new BlogPost();
        first.authorName = "John Doe";
        first.title = "Lorem Ipsum";
        first.publicationDate = "2000.05.04";
        first.text = "Lorem ipsum dolor sit amet";

        BlogPost second = new BlogPost();
        second.authorName = "Tim Urban";
        second.title = "Wait but why";
        second.publicationDate = "2010.10.10";
        second.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

        BlogPost third = new BlogPost();
        third.authorName = "William Turton";
        third.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        third.publicationDate = "2017.03.28";
        third.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";

    }
}
