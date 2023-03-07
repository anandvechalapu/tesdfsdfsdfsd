
Below is the code generated for the given User Story:

Controller:

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/code-generation")
public class CodeGenerationController {

    @RequestMapping(value = "/generate")
    public void generateCode(@RequestParam("codeGen") String codeGen,
                             @RequestParam("pattern") String pattern,
                             @RequestParam("design") String design,
                             @RequestParam("jiraProject") String jiraProject,
                             @RequestParam("userStories") String userStories,
                             @RequestParam("gitHubRepo") String gitHubRepo){
        // Code to generate code and publish to GitHub
    }
}

Service:

import org.springframework.stereotype.Service;

@Service
public class CodeGenerationService {

    public void generateCode(String codeGen, String pattern, String design, String jiraProject, String userStories, String gitHubRepo) {
        // Code to generate code and publish to GitHub
    }
}

Repository:

import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeGenerationRepository extends JpaRepository<Object, Long> {

}