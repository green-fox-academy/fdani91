package Blog;

import java.util.ArrayList;

public class Blog {
    ArrayList<BlogPost> blogPostok;

    public Blog() {
        blogPostok = new ArrayList<>();
    }

    public void add(BlogPost blogPost) {
        blogPostok.add(blogPost);
    }

    public void delete(int index) {
        blogPostok.remove(index);
    }

    public void update(int index, BlogPost blogPost) {
        blogPostok.set(index, blogPost);
    }
}