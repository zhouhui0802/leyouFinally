package api;


import com.leyou.user.pojo.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/21 9:12
 */
public interface UserApi {

    @GetMapping("/query")
    ResponseEntity<User> queryUser(@RequestParam("username") String username,
                                   @RequestParam("password") String password);
}
