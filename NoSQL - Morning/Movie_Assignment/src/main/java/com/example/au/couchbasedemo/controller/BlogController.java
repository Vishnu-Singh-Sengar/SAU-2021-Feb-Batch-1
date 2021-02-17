package com.example.au.couchbasedemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.au.couchbasedemo.model.Blogs;
import com.example.au.couchbasedemo.repository.BlogRepository;

@RestController
public class BlogController {
    
    @Autowired
    BlogRepository blogRepository;
    
	/*
	 * @RequestMapping("/") public String index() { return
	 * "Welcome to the CRUD application!!"; }
	 */
    
    @PostMapping("/blogs")
    public Blogs addBlogPost(@RequestBody Blogs newBlog) {
        return blogRepository.save(newBlog);
    }
    
    @GetMapping("/blogs/{id}")
    public Optional<Blogs> getBlog(@PathVariable String id) {
        if (blogRepository.existsById(id)) {
            return blogRepository.findById(id);
        } else
            return Optional.empty();
    }
    
    @GetMapping("/blogs/city/{city}")
    public List<Blogs> getBlogBycityName(@PathVariable List<String> city) {
        List<Blogs> blogsList=new ArrayList<>();
       blogRepository.findAll().forEach(Blogs->{
           List<String> cityInBlog=Blogs.getcity();
           for(String s:city)
           {
               if(cityInBlog.contains(s))
               {
                   blogsList.add(Blogs);
                   break;
               }
           }
       });
       return blogsList;
    }
    
    @DeleteMapping("/blogs/MovieName/{MovieName}/city/{city}")
    public List<Blogs> deleteBycityAndMovieName(@PathVariable String MovieName, @PathVariable List<String> city) {
        return blogRepository.deleteByMovieNameAndcity(MovieName, city);
    }
    
    @DeleteMapping("/blogs/{id}")
    public void deleteById(@PathVariable String id) {
        blogRepository.deleteById(id);
    }

    @GetMapping("/blogs/genres/{genres}")
    public List<Blogs> getBlogBygenresName(@PathVariable List<String> genres) {
        List<Blogs> blogsList=new ArrayList<>();
       blogRepository.findAll().forEach(Blogs->{
           List<String> genresInBlog=Blogs.getgenres();
           for(String s:genres)
           {
               if(genresInBlog.contains(s))
               {
                   blogsList.add(Blogs);
                   break;
               }
           }
       });


            return blogsList;
    }

}