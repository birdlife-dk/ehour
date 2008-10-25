/**
 * Created on Nov 28, 2006
 * Created by Thies Edeling
 * Copyright (C) 2005, 2006 te-con, All Rights Reserved.
 *
 * This Software is copyright TE-CON 2007. This Software is not open source by definition. The source of the Software is available for educational purposes.
 * TE-CON holds all the ownership rights on the Software.
 * TE-CON freely grants the right to use the Software. Any reproduction or modification of this Software, whether for commercial use or open source,
 * is subject to obtaining the prior express authorization of TE-CON.
 * thies@te-con.nl
 * TE-CON
 * Legmeerstraat 4-2h, 1058ND, AMSTERDAM, The Netherlands
 *
 */

package net.rrm.ehour.user.dao;
import static org.junit.Assert.assertEquals;

import java.util.List;

import net.rrm.ehour.dao.BaseDAOTest;
import net.rrm.ehour.domain.UserRole;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SuppressWarnings("unchecked")
public class UserRoleDAOTest extends BaseDAOTest 
{
	@Autowired
	private	UserRoleDAO	userRoleDAO;
	
	@Test
	public void testFindById()
	{
		UserRole role = userRoleDAO.findById("ROLE_ADMIN");
		assertEquals("Administrator", role.getRoleName());
	}

	@Test
	public void testFindUserRoles()
	{
		List list = userRoleDAO.findAll();
		assertEquals(4, list.size());
	}

}
