package Controller;


import Entities.Recruiter;
import ServiceImpl.EmailService;
import ServiceImpl.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recruiters")
public class RecruitersController {

    @Autowired
    private RecruiterService recruiterService;

    @Autowired
    private EmailService emailService;

    @PostMapping("/add")
    public ResponseEntity<Recruiter> addRecruiter(@RequestBody Recruiter recruiter) {
        return ResponseEntity.ok(recruiterService.addRecruiter(recruiter));
    }
//
//    @GetMapping("/all")
//    public ResponseEntity<List<Recruiter>> getAllRecruiters() {
//        return ResponseEntity.ok(recruiterService.getAllRecruiters());
//    }
//
//    @PostMapping("/email-template")
//    public ResponseEntity<String> saveEmailTemplate(@RequestPart("template") EmailTemplate template,
//                                                    @RequestPart("resume") MultipartFile resume) {
//        return ResponseEntity.ok(emailService.saveTemplate(template, resume));
//    }
//
//    @PostMapping("/send-emails")
//    public ResponseEntity<String> sendEmailsToAllRecruiters() {
//        emailService.sendEmails();
//        return ResponseEntity.ok("Emails sent successfully.");
//    }
}
