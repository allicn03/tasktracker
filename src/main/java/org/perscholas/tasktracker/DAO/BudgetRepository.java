//package org.perscholas.tasktracker.DAO;
//
//import org.perscholas.tasktracker.models.Budget;
//import org.perscholas.tasktracker.models.User;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.util.Set;
//import java.util.TreeSet;
//
//public interface BudgetRepository extends JpaRepository<Budget, Long> {
//    TreeSet<Budget> findByUsers(Set<User> users);
//}
////