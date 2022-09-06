package com.springbook.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// DAO(Data Access Object)
public class BoardDAO {
	// JDBC ���� ����
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	// SQL ���ɾ��
	private final String BOARD_INSERT = " insert into board(seq, title, writer, content) "
									  + " values((select nvl(max(seq), 0)+1 from board),?,?,?)";
	private final String BOARD_UPDATE = " update board set title = ?, content = ?, where seq = ? ";
	private final String BOARD_DELETE = " delete board where seq = ?";
	private final String BOARD_GET 	  = " select * from board where seq = ?";
	private final String BOARD_LIST   = " select * from board order by seq desc";

}