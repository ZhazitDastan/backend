//package app.Services;
//
//import app.Model.TransactionCard;
//import app.Repository.TransactionCardRepository;
//import app.Repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class TransactionCardService {
//    @Autowired
//    private TransactionCardRepository transactionCardRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public List<TransactionCard> getTransactionCardsByUserId(Long userId) {
//        return transactionCardRepository.findByUserId(userId);
//    }
//
//    public Optional<TransactionCard> getTransactionCardById(Long cardId) {
//        return transactionCardRepository.findById(cardId);
//    }
//
//    public TransactionCard addTransactionCard(Long userId, TransactionCard card) {
//        return userRepository.findById(userId).map(user -> {
//            card.setUser(user);
//            return transactionCardRepository.save(card);
//        }).orElseThrow(() -> new RuntimeException("User not found"));
//    }
//
//    public void deleteTransactionCard(Long cardId) {
//        transactionCardRepository.deleteById(cardId);
//    }
//}
