package exercises;

import java.util.ArrayList;
import java.util.List;


/* In a social networking web application, users are represented by the
 * Ex4Person class.  Each person has a name, number of likes, and a list
 * friends. They are identified by an unique id. 
 * 
 * The name of a person cannot be changed once set. The name of a person does not 
 * have to be unique.
 * 
 * A new person starts with 0 Likes.  There is a "Like Button" that will be used to
 * increase a person's Likes by 1
 * 
 * A person's friends is a list of other people. This is one of the simplest ways
 * to represent a social network.
 * 
 * */
public class Ex9Person {

	// Fields
	private static int personCount = 0;
	private final int id;
	
	private final String name;
	private int likes;
	private List<Ex9Person> friends;
	
	// Constructor for a new person given a name
	public Ex9Person(String name) {
		this.name = name;
		this.likes = 0;
		this.friends = new ArrayList<Ex9Person>();
		this.id = ++personCount;
	}

	// Methods
	// Note: Since name is 'final,' we do not have a 'setter method'
	public String getName() {
		return name;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public void addLike() {
		this.likes++;
	}

	public List<Ex9Person> getFriends() {
		return friends;
	}

	public void setFriends(List<Ex9Person> friends) {
		this.friends = friends;
	}
	
	// STUDENT-TODO
	// Return true if this person is friends with the given input person
	public Boolean hasFriend(Ex9Person person) {
		return this.friends.contains(person);
		/* Alternative solution
		for (Ex4Person friend: this.friends) {
			if (friend.equals(person)) {
				return true;
			}
		}
		return false;
		*/
	}
	
	// STUDENT-TODO
	// Add a friend to this person's list of friends, if he isn't
	// already a friend. You should also not be able to friend yourself.
	public void addFriend(Ex9Person friend) {
		if (!this.hasFriend(friend) && !this.equals(friend)) {
			this.friends.add(friend);
		}
	}
	
	
	// STUDENT-TODO
	// Return true if this person has a friend with a given input name
	public Boolean hasFriendWithName(String friendName) {
		for (Ex9Person friend: this.friends) {
			if (friend.getName() == friendName) {
				return true;
			}
		}
		return false;
	}
	
	// STUDENT-TODO
	/* Return all mutual friends
	 * Mutual friends are people who have each other in their friend's lists
	 * 
	 * Hint: It will be helpful if the hasFriend method is implemented first
	 * */
	public List<Ex9Person> getMutualFriends() {
		List<Ex9Person> mutualFriends = new ArrayList<Ex9Person>();
		for (Ex9Person friend: this.friends) {
			if (friend.hasFriend(this)) {
				mutualFriends.add(friend);
			}
		}
		return mutualFriends;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ex9Person other = (Ex9Person) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
