package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/sum")
    public String sum(int a, int b) {
        if (!isNumeric(Integer.toString(a)) || !isNumeric(Integer.toString(b))) {
            return "Invalid input! Please enter a number.";
        }
        return Integer.toString(a + b);
    }

    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @RestController
    @RequestMapping("/api")
    public class HelloWorldControllerNested {

        // Create
        @PostMapping("/data")
        public String createData(@RequestBody String data) {
            // Logic to create data
            return "Data created: " + data;
        }

        // Read
        @GetMapping("/data/{id}")
        public String getData(@PathVariable int id) {
            // Logic to retrieve data by ID
            return "Data with ID " + id;
        }

        // Update
        @PutMapping("/data/{id}")
        public String updateData(@PathVariable int id, @RequestBody String newData) {
            // Logic to update data by ID
            return "Data with ID " + id + " updated: " + newData;
        }

        // Delete
        @DeleteMapping("/data/{id}")
        public String deleteData(@PathVariable int id) {
            // Logic to delete data by ID
            return "Data with ID " + id + " deleted";
        }

    } // Add this closing curly brace
}