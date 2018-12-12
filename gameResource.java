package com.hrish.demorest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Game")
public class gameResource 
{
	

		Repository rep = new Repository();
		
		@GET 
		@Produces(MediaType.APPLICATION_JSON)
		public List<game> gamePoints() {
			System.out.println("game is started");
			return rep.getGame();
			
			
		}
		@GET 
		@Path("Game/{id}")
		@Produces(MediaType.APPLICATION_JSON)
		public game getid(@PathParam("id") int id) {
			System.out.println("game is started");
			return rep.getgame(id);
			
			
		}
		
		@POST
		@Path("games")
		public game creategame(game g1) {
			System.out.println(g1.toString());
			rep.create(g1);
			return g1;
		}
		
	
}
