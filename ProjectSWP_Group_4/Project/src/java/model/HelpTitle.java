/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author trung
 */

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor

public class HelpTitle {
    private int TitleID;
    private String Title;
    private int UserID;
    private int CategoryID;
}