package com.lucoweb.hello.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.ibatis.transaction.Transaction;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.mysql.cj.jdbc.PreparedStatement;

import com.lucoweb.hello.dto.TicketDto;

public class TicketDao {
	
	JdbcTemplate template;
	TransactionTemplate transactionTemplate1;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void setTransactionTemplate1(TransactionTemplate transactionTemplate1) {
		this.transactionTemplate1 = transactionTemplate1;
	}

	public TicketDao() {
		super();
		System.out.println(template);
	}
	
	public void buyTicket(final TicketDto dto){
		System.out.println("buyTicket()");
		System.out.println("dto.getConsumerId() : " + dto.getConsumerId());
		System.out.println("dto.getAmount() : " + dto.getAmount());
		
		transactionTemplate1.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				template.update(new PreparedStatementCreator() {
					
					@Override
					public PreparedStatement createPreparedStatement(Connection con)
							throws SQLException {
						String query = "insert into card (consumerId, amount) values (?, ?)";
						PreparedStatement pstmt = con.prepareStatement(query);
						pstmt.setString(1, dto.getConsumerId());
						pstmt.setString(2, dto.getAmount());
						
						return pstmt;
					}

					@Override
					public java.sql.PreparedStatement createPreparedStatement(Connection con) throws SQLException {
						// TODO Auto-generated method stub
						return null;
					}
				});
				
				template.update(new PreparedStatementCreator() {
					
					@Override
					public PreparedStatement createPreparedStatement(Connection con)
							throws SQLException {
						String query = "insert into card (consumerId, amount) values (?, ?)";
//						String query = "insert into ticket (consumerId, countnum) values (?, ?)";
						PreparedStatement pstmt = con.prepareStatement(query);
						pstmt.setString(1, dto.getConsumerId());
						pstmt.setString(2, dto.getAmount());
						
						return pstmt;
					}

					@Override
					public java.sql.PreparedStatement createPreparedStatement(Connection con) throws SQLException {
						// TODO Auto-generated method stub
						return null;
					}
				});
			}

			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				// TODO Auto-generated method stub
				
			}
		});
		
//		TransactionDefinition definition = new DefaultTransactionDefinition();
//		TransactionStatus status = transactionManager.getTransaction(definition);
		
//		try {
//		
//			
//		
//			transactionManager.commit(status);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			
//			transactionManager.rollback(status);
//		}
	}

	
}