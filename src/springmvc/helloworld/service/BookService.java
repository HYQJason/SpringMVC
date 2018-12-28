package springmvc.helloworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springmvc.helloworld.dao.BookDao;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;
    public int getdata(){
        return bookDao.getData();
    }

    public void setData(int data){

        bookDao.setData(data);

    }
}
