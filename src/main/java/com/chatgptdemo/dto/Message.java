/**
 * 
 */
package com.chatgptdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Muralidharan
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
	
	private String role;
	private String content;

}
