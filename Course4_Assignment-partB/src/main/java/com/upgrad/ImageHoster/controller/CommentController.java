package com.upgrad.ImageHoster.controller;

import com.upgrad.ImageHoster.model.Image;
import com.upgrad.ImageHoster.model.Tag;
import com.upgrad.ImageHoster.model.User;
import com.upgrad.ImageHoster.service.ImageService;
import com.upgrad.ImageHoster.service.TagService;
import com.upgrad.ImageHoster.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.StringTokenizer;

@Controller
public class CommentController {

}
