package com.rashad.springcassandrainboxapp.emailslist;

import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;

public interface EmailsListRepository extends CassandraRepository<EmailsList, EmailsListPrimaryKey> {
    List<EmailsList> findAllById_UserIdAndId_Label(String userId, String label);
}
