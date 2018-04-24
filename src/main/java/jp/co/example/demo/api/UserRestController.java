package jp.co.example.demo.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import jp.co.example.demo.entity.User;

@RestController
public class UserRestController {
    
    @GetMapping("/users")
    @ApiOperation(value="ユーザーの取得")
    public List<User> getUsers(String query){
        return new ArrayList<>();
    }

    @PostMapping("/users")
    @ApiOperation(value="ユーザーの作成")
    public void postUser(@RequestBody User user){
    }
    
    @GetMapping("/user/{id}")
    @ApiOperation(value="ユーザーの取得")
    public User getUser(@ApiParam(value="ユーザーID") @PathVariable String id){
        return new User();
    }
    
    @PutMapping("/user/{id}")
    @ApiOperation(value="ユーザーの更新")
    public User putUser(@ApiParam(value="ユーザーID") 
                        @PathVariable 
                        String id,
                        @ApiParam(value="更新するユーザー情報")
                        @RequestBody
                        User user
                        ){
        return new User();
    }
    
}
