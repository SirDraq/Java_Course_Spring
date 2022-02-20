package com.AndrzejJarosz.module.blog;

import com.AndrzejJarosz.module.blog.menu.MenuService;
import com.AndrzejJarosz.module.blog.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @Autowired
    private MenuService menuService;
    @Autowired
    private PostService postService;

    @GetMapping("/blog")
    public String getBlog(Model model){
        model.addAttribute("menuItems" , menuService.getMenu());
        model.addAttribute("posts",postService.getPosts());
        return "blog/index.html";
    }
}
