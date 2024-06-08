//package app.Controllers;
//
//import app.Model.TransactionCard;
//import app.Services.TransactionCardService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/transaction-cards")
//public class TransactionCardController {
//
//    @Autowired
//    private TransactionCardService transactionCardService;
//
//    @GetMapping("/user/{userId}")
//    public List<TransactionCard> getTransactionCardsByUserId(@PathVariable Long userId) {
//        return transactionCardService.getTransactionCardsByUserId(userId);
//    }
//
//    @GetMapping("/{cardId}")
//    public ResponseEntity<TransactionCard> getTransactionCardById(@PathVariable Long cardId) {
//        return transactionCardService.getTransactionCardById(cardId)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @PostMapping("/user/{userId}")
//    public ResponseEntity<TransactionCard> addTransactionCard(@PathVariable Long userId, @RequestBody TransactionCard card) {
//        try {
//            TransactionCard savedCard = transactionCardService.addTransactionCard(userId, card);
//            return ResponseEntity.ok(savedCard);
//        } catch (RuntimeException e) {
//            return ResponseEntity.badRequest().body(null);
//        }
//    }
//
//    @DeleteMapping("/{cardId}")
//    public ResponseEntity<Void> deleteTransactionCard(@PathVariable Long cardId) {
//        transactionCardService.deleteTransactionCard(cardId);
//        return ResponseEntity.noContent().build();
//    }
//}
//
