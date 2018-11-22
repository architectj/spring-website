package io.hoesoo.springwebsite.web;

import io.hoesoo.springwebsite.domain.posts.PostsRepository;
import io.hoesoo.springwebsite.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

//    private PostsRepository postsRepository;
private PostsService postsService;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }


    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){

        // 생성일 추가 코드 예제
//        posts.setCreateDate(new LocalDate());
//        postsRepository.save(posts);
        postsService.save(dto);


    }
}
