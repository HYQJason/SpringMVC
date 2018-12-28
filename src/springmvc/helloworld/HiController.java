package springmvc.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import springmvc.helloworld.bean.BaseResponse;
import springmvc.helloworld.bean.Info;
import springmvc.helloworld.service.BookService;

import java.util.LinkedHashMap;

@Controller
@RequestMapping("/HiController")
public class HiController {
    LinkedHashMap
//lazy 懒加载，延迟加载，第一次获取时加载
    // @Autowired  支持构造方法（如只有一个有参构造方法，可以省略Autowired），方法，属性 自动注入  根据类型查找，根据属性名查找.Qualifier 指定需要注入的。@Primary 指定首选的注入
    //Spring 支持使用@Resource (JSR250)和 @Inject(JSR330)都是java的注解规范 实现自动装配

    //A a//所有申明注解的单实例java类（多实例的java类，会在获取的时候创建（代码和xml中由Scope控制 ），在tomcat 启动的时候创建实列，加入IOC 控制反转
    //context:component-scan base-package ="路径"//支持以下四个注解，@controller @Servics @Repository @Compomemt//加入ioc
    //@Conditional() 按条件注册bean （满足条件，加入ioc）
    //@Import() ImportSelector//返回需要导入的组件的全类名数组。ImportBeanDefintionRegistran//安条件，注册bean  // 加入ioc
    //使用Spring 提供的FactoryBean//加入ioc
    //bean 加入ioc
    // bean的生命周期，创建...初始化...销毁
    // 1 bean 注解中init-method和destroy-methon 加入指定方法
    //2 接口 InitializingBean, DisposableBean
    //3 JSR250规范  @PostConstruct （bean 初始化完成，属性赋值后）执行初始化方法。perDestroy ioc移除之前调用
    //4 BeanPostProcessor  bean的后置处理器，postProcessBeforeInitialization 初始化之前调用 ，postProcessAfterInitialization，初始化之后
    //bean的赋值1.属性上加1 @Value 可写基本数据类型，（#{20-2 }）， ${ }读取配置文件.properties()通过PropertySource加载
    //xxxAware 可以把Spring 的一些组件注入到Bean中
    //@Profile()环境 （开发，测试，生产） 可以为我们提供根据当前环境，动态激活切换一系列组件功能

    //aop切片编程，（导入spring-aspects包）底层动态代理  程序运行时动态将某段代码切入到指定方法指定位置运行的编程方式
//@Before 方法之前 前置通知。 @After 后者通知  @AfterReturning 返回通知  AfterThrowing 目标方法运行异常通知  around环绕通知

    @Autowired
    private BookService bookService;

/*    @RequestMapping(value = "/data",method = RequestMethod.GET)
    public String getData(Model model,@RequestParam (value = "data")String data) {
        System.out.print("----------------");
        if (model != null) {
            bookService.setData(Integer.valueOf(data));
        }
        model.addAttribute("data",bookService.getdata());
        return "index";

    }*/

    @RequestMapping(value = "/index/{data}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable(value = "data") String data) {
        ModelAndView model = new ModelAndView("index");
        model.addObject("data", data);
        return model;
    }

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public ModelAndView getData(@RequestParam(value = "data") String data) {
        ModelAndView model = new ModelAndView("index");
        if (model != null) {
            bookService.setData(Integer.valueOf(data));
        }
        model.addObject("data", bookService.getdata());
        return model;
    }

    @RequestMapping("/say")
    public String say(Model model) {
        model.addAttribute("name", "百度"); // 指定Model的值
        model.addAttribute("url", "http://www.baidu.com"); // 指定Model的值
        return "say";

    }

    @RequestMapping("/info")
    @ResponseBody
    public BaseResponse getInfo (@RequestBody Info info) {
        System.out.print("--------------info--" + info);
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(200);
        baseResponse.setMessage("200");
        baseResponse.setResponse(info);
        return baseResponse;
    }


    @RequestMapping(value = "getuser", method = RequestMethod.GET)
    public String getUser(ModelMap modelMap, @RequestParam(value = "name") String name, @RequestParam(value = "age") int age) {
        modelMap.addAttribute("name", name);
        modelMap.addAttribute("age", age);
        return "get_user";

    }

    @RequestMapping(value = "adduser", method = RequestMethod.GET)
    public String adduser() {

        return "add_user";
    }
}
