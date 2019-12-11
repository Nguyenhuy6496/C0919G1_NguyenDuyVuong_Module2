package springboot.project_management.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import springboot.project_management.model.Product;
import springboot.project_management.service.ProductService;
import springboot.project_management.service.ProductServiceImplements;

@Controller
public class ProductController {
    private ProductService productService = new ProductServiceImplements();

    @GetMapping("/")
    public ModelAndView productList() {
        return new ModelAndView("displayProductList", "products", productService.ShowAll());
    }

    @GetMapping("/product/create")
    public ModelAndView createProduct() {
        return new ModelAndView("createProduct", "product", new Product());
    }

    @PostMapping("/product/save")
    public ModelAndView saveProduct(Product product, RedirectAttributes redirect) {
        productService.save(product);
        redirect.addFlashAttribute("success", "Save new product successfully!");
        return new ModelAndView("redirect:/");
    }

    @GetMapping("/product/{id}/view")
    public ModelAndView productDetails(@PathVariable int id) {
        return new ModelAndView("productDetails", "details", productService.findById(id));
    }

    @GetMapping("/product/{id}/edit")
    public ModelAndView editProduct(@PathVariable int id) {
        return new ModelAndView("editProduct", "details", productService.findById(id));
    }

    @PostMapping("/product/update")
    public ModelAndView updateProduct(Product product, RedirectAttributes redirect) {
        productService.update(product.getId(), product);
        redirect.addFlashAttribute("success", "Modified product successfully!");
        return new ModelAndView("redirect:/");
    }

    @GetMapping("/product/{id}/delete")
    public ModelAndView deleteProduct(@PathVariable int id) {
        return new ModelAndView("deleteProduct", "details", productService.findById(id));
    }

    @PostMapping("/product/delete")
    public ModelAndView deleteProduct(Product product, RedirectAttributes redirect) {
        productService.remove(product.getId());
        redirect.addFlashAttribute("success", "Remove product successfully!");
        return new ModelAndView("redirect:/");
    }

}
