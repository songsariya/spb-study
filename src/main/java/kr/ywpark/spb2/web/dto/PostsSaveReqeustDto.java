package kr.ywpark.spb2.web.dto;

import kr.ywpark.spb2.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveReqeustDto {

    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveReqeustDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity() {
        return Posts.builder().title(title).content(content).author(author).build();
    }
}
