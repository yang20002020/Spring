package Demo;

import com.fuyu.service.BookService;
import com.fuyu.service.impl.BookServiceImpl;

public class Demo1 {
    public static void main(String[] args) {
        BookService bookService=new BookServiceImpl();
        bookService.save();
    }
}
