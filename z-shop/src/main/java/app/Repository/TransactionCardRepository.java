package app.Repository;

import app.Model.TransactionCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionCardRepository extends JpaRepository<TransactionCard, Long> {
    List<TransactionCard> findByUserId(Long userId);
}

