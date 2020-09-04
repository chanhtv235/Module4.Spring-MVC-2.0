package picture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import picture.model.Comment;
import picture.service.CommentService;
import picture.service.CommentServiceImpl;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private CommentService commentService = new CommentServiceImpl();
    @GetMapping("/")
    public ModelAndView getHomePage(){
//        List<Comment> comments = commentService.getAllCommentByDate();
//        ModelAndView modelAndView = new ModelAndView("index","listComment",comments);
//        modelAndView.addObject("newComment", new Comment());
        ModelAndView modelAndView=new ModelAndView("index");
        return modelAndView;
    }
//    @PostMapping("/")
//    public String insertComment(@ModelAttribute Comment newComment){
//        commentService.insertComment(newComment);
//        return "redirect:/";
//    }
//    @GetMapping("/increment/{id}")
//    public String incrementLikes(@PathVariable int id){
//        Comment comment = commentService.getById(id);
//        comment.setLikes(comment.getLikes() + 1);
//        commentService.incrementLike(comment);
//        return "redirect:/";
//    }
}
