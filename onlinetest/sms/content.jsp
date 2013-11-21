 <table class="center">
	<tbody>
        <tr valign="top">
            <td>
              <input name="phoneNo" type="text" id="phoneNo" value="Send To Mobile No" onfocus="if(this.value==this.defaultValue)this.value='';" onblur="if(this.value=='')this.value=this.defaultValue;">
            </td>
        </tr>
        <tr valign="top">
            <td>
				<textarea name="msg" rows="4" cols="16" id="msg" maxlength="100"  onfocus="if(this.value==this.defaultValue)this.value='';" onblur="if(this.value=='')this.value=this.defaultValue;">Message To Send</textarea>
            </td>
        </tr>
		<tr valign="top">
            <td>
				<div id="count">100</div>		
            </td>
        </tr>
        <tr valign="top">
            <td>
				<input type="button" id="send" value="Send" ><br>
				<br>
            </td>
        </tr>
        <tr valign="top">
            <td class="center">
				<div class="center" id="result"></div>
            </td>
         </tr>
    </tbody>
</table>
