package uo.mp.dome;

/**
 * Assignment #3
 * Publication date: 18/02/22
 * Due date: 24/02/22 at 12:00 (Group L-I-5)
 * Submit via: Virtual Campus
 *
 *
 * EXERCISE 1
 *
 * Using as basis DOME project implemented in classroom activities:
 *
 *TODO
 * 1. Add javadoc comments to all public methods in all classes. Generate
 *      javadoc. 
 *
 *DONE
 * 2. Validate method arguments you consider necessary, using ArgumentChecks.
 *      Rewrite any existing validation not using ArgumentChecks.
 *      For strings, check they are neither null nor empty nor containing just
 *      blanks. That is, there should be at least one non blank character.
 *      Revise tests so all them keep succeeding (green). DONE
 *
 *DONE
 * 3. Add to MediaLibrary a method int searchItem(Item theItem) that searches
 *      the library for an item like the one received as a parameter and
 *      returns its position in the list of items or -1 if it has not been
 *      found.
 *      Write tests for this method and execute them.
 *
 *
 * 4. Add method String getResponsibles() to class MediaLibrary. It returns a
 *      string with the responsible for all items owned, separated with commas.
 *      For CDs, responsible will be the artist while for Dvd, the
 *      responsible will be the director and for video games, the author.
 *      If there are not items owned, just return an empty String.
 *
 * 5. Add a new VideoGame item. A VideoGame has:
 *      A title
 *      The author
 *      It does not have playing time
 *      It may be (or may not) be owned
 *      We can add a comment to it
 *      Can be shown in the console with print
 *      A number of players
 *      One platform among XBox, PlayStation or Nintendo
 *
 * 6. Improve (or add if it has not been implemented during the session) the
 *      tests for method numberOfItemsOwned(), adding video games to it.
 *
 * 7. Check that the print method in MediaLibrary also prints video games in the
 *      console.
 *
 * 8. Execute all existing tests.
 *
 * 9. Write the body of method MediaPlayer::run(). You must create at least 3
 *      objects of each class (CD, DVD, VideoGame) to check that
 *      numberOfItemsOwned, getResponsibles and list are executed correctly.
 *
 *
 *
 * EXERCISE 2
 *
 * You have to write an application that manages the posts included in a
 * social network. Users have the possibility to include two types of post:
 * text messages and photos. A text message consists of a string with the
 * message, while the insertion of a photo means saving the name of the name
 * of the file with the photo as well as a title. In addition, all posts will
 * have information about the likes they have received (a counter). You can
 * also write comments to the post, so each post has a list of comments
 * associated with it. A comment will be stored as a string. Each post also
 * has the identifier of the user who created it, an integer. When a new post
 * is created, arguments for every attribute must be provided except likes
 * that are set to zero and comments, initially empty. All other must be
 * non-null, non-empty strings. Create a project that manages the social
 * network along with the posts that can be included, so that the network
 * stores all the post and can perform the following operations:
 *
 *      void addPost(Post post) This operation adds the post to the network.
 *      If argument is null, throw IllegalArgumentException.
 *
 *      String getAllPosts() This operation returns attributes of all posts,
 *      in diferent lines each. Implement public String toString() in all
 *      post classes to return individual strings. Use this toString when
 *      implementing this method.
 *      A possible output for each toString could be:
 *          PHOTO User: username, File: filename, Title: title
 *          MESSAGE User: username, Content: text
 *
 *      ArrayList<Post> findPostsByUser(int userId) Get a user's post. Receive a
 *      user as a parameter and return the list of all the posts correspond.
 *      Write functional and robustness tests for the constructor of all post
 *      classes, toString, addPost and findPostByUser.
 *
 *      Finally, create a class NetworkApp to create a SocialNetwork
 *      instance, add a photo and a message from two diferent users, searches
 *      and prints posts associated with one user. Add also a Main class.
 */
