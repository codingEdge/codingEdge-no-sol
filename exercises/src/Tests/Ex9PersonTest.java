package Tests;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import exercises.Ex9Person;


public class Ex9PersonTest {

	@Test
	public void getNameTest() {
		Ex9Person jim = new Ex9Person("Jim");
		assertEquals("Jim", jim.getName());
	}
	
	@Test
	public void addLikesTest() {
		Ex9Person jim = new Ex9Person("Jim");
		assertEquals(0, jim.getLikes());
		jim.addLike();
		assertEquals(1, jim.getLikes());
		jim.addLike();
		assertEquals(2, jim.getLikes());
	}
	
	@Test
	public void addFriendTest() {
		Ex9Person jim = new Ex9Person("Jim");
		Ex9Person ray = new Ex9Person("Ray");
		Ex9Person kerry = new Ex9Person("Kerry");
		
		jim.addFriend(ray);
		jim.addFriend(kerry);
		
		List<Ex9Person> friends = jim.getFriends();
		assertEquals(2, friends.size());
		assertTrue(friends.contains(ray));
		assertTrue(friends.contains(kerry));
	}
	
	@Test
	public void addFriendShouldNotContainDuplicatesTest() {
		Ex9Person jim = new Ex9Person("Jim");
		Ex9Person ray = new Ex9Person("Ray");
		Ex9Person ray2 = new Ex9Person("Ray");
		
		jim.addFriend(ray);
		jim.addFriend(ray);
		jim.addFriend(ray2);
		
		List<Ex9Person> friends = jim.getFriends();
		assertEquals(2, friends.size());
		assertTrue(friends.contains(ray));
		assertTrue(friends.contains(ray2));
	}
	
	@Test
	public void addFriendShouldNotAddYourselfTest() {
		Ex9Person jim = new Ex9Person("Jim");
		
		jim.addFriend(jim);
		
		List<Ex9Person> friends = jim.getFriends();
		assertEquals(0, friends.size());
		assertFalse(friends.contains(jim));
	}
	
	@Test
	public void hasFriendTest() {
		Ex9Person jim = new Ex9Person("Jim");
		Ex9Person ray = new Ex9Person("Ray");
		Ex9Person kerry = new Ex9Person("Kerry");
		Ex9Person kerry2 = new Ex9Person("Kerry");
		
		jim.addFriend(ray);
		jim.addFriend(kerry);
		
		assertTrue(jim.hasFriend(ray));
		assertTrue(jim.hasFriend(kerry));
		assertFalse(jim.hasFriend(kerry2));
	}
	
	@Test
	public void hasFriendWithNameTest() {
		Ex9Person jim = new Ex9Person("Jim");
		Ex9Person ray = new Ex9Person("Ray");
		Ex9Person kerry = new Ex9Person("Kerry");
		
		jim.addFriend(ray);
		jim.addFriend(kerry);
		
		assertTrue(jim.hasFriendWithName("Ray"));
		assertTrue(jim.hasFriendWithName("Kerry"));
		assertFalse(jim.hasFriendWithName("Jim"));
	}
	
	@Test
	public void getMutualFriendsTest() {
		Ex9Person me = new Ex9Person("Me");
		Ex9Person friend1 = new Ex9Person("Friend1");
		Ex9Person friend2 = new Ex9Person("Friend2");
		Ex9Person nonMutualFriend = new Ex9Person("NonMutualFriend");
		
		me.addFriend(friend1);
		me.addFriend(friend2);
		me.addFriend(nonMutualFriend);
		friend1.addFriend(me);
		friend2.addFriend(me);
		
		List<Ex9Person> mutuals = me.getMutualFriends();
		
		assertEquals(2, mutuals.size());
		assertTrue(mutuals.contains(friend1));
		assertTrue(mutuals.contains(friend2));
		assertFalse(mutuals.contains(nonMutualFriend));
	}
}
