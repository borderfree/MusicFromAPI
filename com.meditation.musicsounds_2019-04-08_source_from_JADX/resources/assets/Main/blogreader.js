function BlogReaderTableResize()
{  
    var rsstableElem= document.getElementById("rsstable");
	if (rsstableElem == null)
	{
		rsstableElem = document.getElementById("podcasttable");
	}
    if (rsstableElem != null)
    {
        try
        {
            var iDoc = rsstableElem.contentWindow.document;
            if (iDoc != null)
            {
                var ifrH = iDoc.body.offsetHeight;
		ifrH += 20;
                if (ifrH < 380)
                {
                    ifrH = 380;
                }
                rsstableElem.style.height = ifrH+"px";
            }
        }
        catch(err)
        {

        }
    } 
}

function SetPageSettingValue(key, value)
  {

    //alert("SetPageSettingValue Key: " + key + ", Value: " + value);
    if(key === 'rsstable') {
      var iframe = document.getElementById('rsstable');
      var src = iframe.src;
      var params = getUrlVars(src);
      params.rssurl = value;
      var newSrc = src.slice(0, src.indexOf('?') + 1);
      for (var i = 0; i < params.length; i++) {
        param = params[i];
        newSrc += ((i == 0) ? '' : '&') + param + '=' + encodeURIComponent(params[param]);
      }
      iframe.src = newSrc;
    } else {
        var element = document.getElementById(key);
        if(element != null)
        {
          element.innerHTML = value;
        }
    }
  }

  function GetPageSettingValue( key )
  {
    var result = null;

    if(key === 'rsstable') {
      var iframe = document.getElementById('rsstable');
      result = getUrlVars(iframe.src)['rssurl'] || '';
      result = decodeURIComponent(result);
    } else {
        var element = document.getElementById(key);
        if(element != null)
        {
          result = element.innerHTML;
        } 
    }
    //alert("GetPageSettingValue Key: " + key + ", Value: " + result);

    return result;
  }


    function getUrlVars(url) {
      var vars = [], hash;
      var hashes = url.slice(url.indexOf('?') + 1).split('&');
      for(var i = 0; i < hashes.length; i++)
      {
          hash = hashes[i].split('=');
          vars.push(hash[0]);
          vars[hash[0]] = hash[1];
      }
      return vars;
    }