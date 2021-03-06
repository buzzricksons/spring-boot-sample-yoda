package example.mybatis.mapper.data;

import lombok.*;

@Getter
@ToString
@RequiredArgsConstructor
@Builder
public class City {
    @NonNull
    private String code;
    @NonNull
    private String name;
    @NonNull
    private String state;
    @NonNull
    private String country;
}